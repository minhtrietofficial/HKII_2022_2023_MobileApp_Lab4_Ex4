package com.leminhtriet.lab4_ex4;


import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Random random = new Random();
    int randomNumber = random.nextInt(91) + 10;
    private GridView gvComputers;
    private List<Computer> computers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvComputers = findViewById(R.id.gvComputers);

        generateRandomItems();
        setCustomAdapter();
    }

    private void setCustomAdapter() {
        ComputerArrayAdapter computerArrayAdapter = new ComputerArrayAdapter(this,
                R.layout.grid_item_row, computers);
        gvComputers.setAdapter(computerArrayAdapter);
    }

    private void generateRandomItems() {
        for (int i = 1; i < randomNumber; i++) {
            String computerName = "PC " + i;
            Computer newComputer = new Computer(computerName, true);
            computers.add(newComputer);
        }
    }
}
