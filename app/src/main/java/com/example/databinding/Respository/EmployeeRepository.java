package com.example.databinding.Respository;

import androidx.lifecycle.MutableLiveData;
import com.example.databinding.model.Employee;
import com.example.databinding.model.EmployeeDBResponse;
import com.example.databinding.network.EmployeeDataService;
import com.example.databinding.network.RetrofitClient;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmployeeRepository {

  //from here it is picking all the attributes from employee pojo class

  private ArrayList<Employee> employees = new ArrayList<>();
  private MutableLiveData<List<Employee>> mutableLiveData = new MutableLiveData<>();

  public EmployeeRepository() {
  }

  public MutableLiveData<List<Employee>> getMutableLiveData() {

    final EmployeeDataService userDataService = RetrofitClient.getService();

    Call<EmployeeDBResponse> call = userDataService.getEmployees();
    call.enqueue(new Callback<EmployeeDBResponse>() {
      @Override
      public void onResponse(Call<EmployeeDBResponse> call, Response<EmployeeDBResponse> response) {
        EmployeeDBResponse employeeDBResponse = response.body();
        if (employeeDBResponse != null && employeeDBResponse.getData() != null) {
          employees = (ArrayList<Employee>) employeeDBResponse.getData();
          mutableLiveData.setValue(employees);
        }
      }

      @Override
      public void onFailure(Call<EmployeeDBResponse> call, Throwable t) {
      }
    });

    return mutableLiveData;
  }
}
