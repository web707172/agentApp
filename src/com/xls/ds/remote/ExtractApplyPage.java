package com.xls.ds.remote;


import java.util.List;

/**
 * Created by luoshun
 */
public class ExtractApplyPage {
    private Integer total;
    private List<ExtractApply> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<ExtractApply> getRows() {
        return rows;
    }

    public void setRows(List<ExtractApply> rows) {
        this.rows = rows;
    }
}
