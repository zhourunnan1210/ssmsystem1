package com.zrn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 85845
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {

    private int studentId;
    private String studentName;
    private String studentSex;
    private String studentGrade;
    private String studentTel;
    private String studentAddress;
    private String studentProf;
    private String studentCol;
}
