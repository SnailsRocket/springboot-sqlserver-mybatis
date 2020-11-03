package com.ibms.app.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author Druid_Xu
 * @Date 2020/11/3 下午 02:33
 * @Description
 */
@Data
public class Student implements Serializable {

    private String sId;
    private String sName;
    private String sBirth;
    private String sSex;

}
