package com.zrn.service;

import com.zrn.pojo.Teachers;
import java.util.List;

/**
 * @author 85845
 */
public interface StudentService {

    /**
     * 根据教师姓名查询该学院的教师
     * @param name 姓名
     * @param col 学院
     * @return 返回教师类型的对象
     */
    List<Teachers> queryTeacherByName(String name,String col);

    /**
     * 查询该学员的全部教师
     * @param col 学院
     * @return 返回教师列表
     */
    List<Teachers> queryAllTeacher(String col);

    /**
     * 查询全部教师
     * @return
     */
    List<Teachers> queryAll();
}
