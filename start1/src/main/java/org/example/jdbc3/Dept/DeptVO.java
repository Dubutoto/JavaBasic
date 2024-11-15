package org.example.jdbc3.Dept;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class DeptVO {
    //가방에 들어갈 데이터 공간을 할당(member테이블의 컬럼명과 동일)
    private int deptNo;
    private String dname;
    private String loc;
}
