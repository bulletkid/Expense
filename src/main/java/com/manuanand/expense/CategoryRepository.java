package com.manuanand.expense;

import org.springframework.data.repository.CrudRepository;

import com.manuanand.expense.Category;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
