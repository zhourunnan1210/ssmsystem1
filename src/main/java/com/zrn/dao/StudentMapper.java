package com.zrn.dao;

import com.zrn.pojo.Teachers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zrn
 */
public interface StudentMapper {

    /**
     * 根据教师姓名查询该学院的教师
     * @param name 姓名
     * @param col 学院
     * @return 返回教师类型的对象
     */
    List<Teachers> queryTeacherByName(@Param("teacherName") String name,@Param("studentCol") String col);

    /**
     * 查询该学员的全部教师
     * @param col 学院
     * @return 返回教师列表
     */
     List<Teachers> queryAllTeacher(@Param("studentCol") String col);

    /**
     * 查询所有老师
     * @return
     */
    List<Teachers> queryAll();

}
