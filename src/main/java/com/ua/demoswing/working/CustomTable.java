/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ua.demoswing.working;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class CustomTable extends AbstractTableModel implements Serializable, TableModel {

    private List<User> listUsers = new ArrayList<>();

    @Override
    public int getRowCount() {
        return listUsers.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return listUsers.get(rowIndex).getName();
        } else {
            return listUsers.get(rowIndex).getEmail();
        }
    }

    public void insertUser(String name, String email) {
        User u = new User(name, email);
        listUsers.add(u);
    }

}
