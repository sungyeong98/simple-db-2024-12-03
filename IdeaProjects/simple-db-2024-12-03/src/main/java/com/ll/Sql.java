package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sql {
    private final SimpleDb simpleDb;
    private final StringBuilder sqlBuilder;
    private final List<Object> params;

    public Sql(SimpleDb simpleDb) {
        this.simpleDb = simpleDb;
        this.sqlBuilder = new StringBuilder();
        this.params = new ArrayList<>();
    }

    public Sql append(String sqlPart, Object... params) {
        sqlBuilder.append(sqlPart).append(" ");
        this.params.addAll(Arrays.asList(params));
        return this;
    }

    public long insert() {
        String sql = sqlBuilder.toString().trim();
        return simpleDb.insertAndReturnKey(sql, params.toArray());
    }

    @Override
    public String toString() {
        return sqlBuilder.toString().trim();
    }
}