package org.com.zhump.entity;


import java.util.List;

/**
 * 分页实体类
 * @param <T>
 */
public class Pagination<T> {

    /**当前页*/
    private Integer currPage;
    /**总记录数*/
    private Integer totalCount;
    /**总页数*/
    private Integer totalPage;
    /**每页条数*/
    private Integer pageSize;
    /**每一页的数据*/
    private List<T> list;

    public Pagination(Integer currPage, Integer totalCount, Integer totalPage, Integer pageSize, List<T> list) {
        this.currPage = currPage;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.pageSize = pageSize;
        this.list = list;
        this.totalPage=this.totalCount%this.pageSize == 0L ?  this.totalCount/this.pageSize : (this.totalCount/this.pageSize+1);

    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        if (currPage == 0){
            currPage  = 1;
        }
        this.currPage = (currPage-1) * pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
