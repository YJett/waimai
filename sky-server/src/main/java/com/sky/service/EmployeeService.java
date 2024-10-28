package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * @description: 新增员工
     * @author ywootae
     * @date 2024/10/28 下午3:09
     * @version 1.0
     */
    void save(EmployeeDTO employeeDTO);
}
