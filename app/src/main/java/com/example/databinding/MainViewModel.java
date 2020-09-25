package com.example.databinding;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.databinding.model.Employee;
import com.example.databinding.Respository.EmployeeRepository;
import java.util.List;

//https://stackoverflow.com/questions/60913945/mvvm-retrofit-retrieve-json-object-list-then-produces-null
//on failure on response  //databinding

public class MainViewModel extends AndroidViewModel {
  private EmployeeRepository employeeRepository;

  public MainViewModel(@NonNull Application application) {
    super(application);
    employeeRepository = new EmployeeRepository();
  }

  public LiveData<List<Employee>> getAllEmployee() {
    return employeeRepository.getMutableLiveData();
  }
}
