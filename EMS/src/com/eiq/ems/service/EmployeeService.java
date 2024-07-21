package com.eiq.ems.service;


import com.quadwave.nbt.common.execution.entity.WorkflowInstance;
import com.quadwave.nbt.common.execution.entity.WorkflowNode;
import com.quadwave.nbt.common.execution.java.JavaNodeHandler;
import com.quadwave.nbt.common.execution.entity.WorkflowVariable;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService extends JavaNodeHandler {


    @Override
    public void execute(WorkflowInstance workflowInstance, WorkflowNode workflowNode) {

        List<WorkflowVariable> workflowVariables=new ArrayList<>();

        String fieldValue = "";
        WorkflowVariable wrkVariable=null;


          wrkVariable= workflowInstance.getVariableByName("registerName");
          if (wrkVariable!=null){
               fieldValue = wrkVariable.getValue();

          }


        wrkVariable.setValue(fieldValue);
        workflowVariables.add(wrkVariable);
        getExecutionContext().setVariableValue("registerName","defult");



    }
}
