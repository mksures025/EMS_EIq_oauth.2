package com.eiq.ems.login;

import com.quadwave.nbt.common.execution.entity.WorkflowInstance;
import com.quadwave.nbt.common.execution.entity.WorkflowNode;
import com.quadwave.nbt.common.execution.entity.WorkflowVariable;
import com.quadwave.nbt.common.execution.java.JavaNodeHandler;

import java.util.*;

public class LoginService extends JavaNodeHandler {

    @Override
    public void execute(WorkflowInstance workflowInstance, WorkflowNode workflowNode) {


        WorkflowVariable password=null;

        WorkflowVariable confirmPassword=null;

        WorkflowVariable userName=null;

        WorkflowVariable isLogin=workflowInstance.getVariableByName("isLogin");

        userName=workflowInstance.getVariableByName("loginUserName");
                password= workflowInstance.getVariableByName("loginPassword");
        confirmPassword=workflowInstance.getVariableByName("loginConfirmPassword");



        if (password!=null && confirmPassword!=null && password.equals(confirmPassword)) {

            String UserNameValue= userName.getValue();
            String passwordValue= password.getValue();
            String confirmPasswordValue=confirmPassword.getValue();
            String isLoginCredential=isLogin.getValue();

            isLoginCredential="true";
              //  getExecutionContext().setVariableValue("loginUserName","UserNameValue");
              //  getExecutionContext().setVariableValue("loginConfirmPassword","confirmPasswordValue");


        }
    }
}
