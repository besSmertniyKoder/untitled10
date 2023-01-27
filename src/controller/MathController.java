package controller;

import Model.EquasionModel;
import Service.Service;

import java.util.ArrayList;
import java.util.List;

public class MathController {
    private Service service = new Service();

    public EquasionModel getNumbers(int a, int b) {
        EquasionModel equasionModelA = new EquasionModel(a);
        EquasionModel equasionModelB = new EquasionModel(b);


        return service.sum(equasionModelA, equasionModelB);

    }
}
