package org.com.zhump.mssp.web.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 树形
 */
@Getter
@Setter
public class MenusTreeVO {

    /**
     * id
     */
    private  Long id;
    /**名称*/
    private String label;
    /**父级ID*/
    private Long pid;

    private boolean checked;
    private String url;

    /**子节点*/
    private List<MenusTreeVO> children;
}
