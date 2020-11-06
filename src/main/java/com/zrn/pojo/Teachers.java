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
public class Teachers {
    private int teacherId;
    private String teacherName;
    private String teacherSex;
    private String teacherTel;
    private String teacherAddress;
    private String teacherProf;
    private String teacherCol;
}
