package com.zrn.service;

import com.zrn.dao.StudentMapper;
import com.zrn.pojo.Teachers;

import java.util.List;

/**
 * @author 85845
 */
public class StudentServiceImpl implements StudentService{
/**
 * service(业务)层调用Dao层：组合Dao
 * 但是也可以在调用之前进行一些其他操作事务
 */

    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    /**
     * 根据教师姓名查询该学院的教师
     *
     * @param name 姓名
     * @param col  学院
     * @return 返回教师类型的对象
     */
    @Override
    public List<Teachers> queryTeacherByName(String name, String col) {
        return studentMapper.queryTeacherByName(name, col);
    }

    /**
     * 查询该学员的全部教师
     *
     * @param col 学院
     * @return 返回教师列表
     */
    @Override
    public List<Teachers> queryAllTeacher(String col) {
        return studentMapper.queryAllTeacher(col);
    }

    /**
     * 查询全部教师
     * @return
     */
    @Override
    public List<Teachers> queryAll() {
        return studentMapper.queryAll();
    }

}
