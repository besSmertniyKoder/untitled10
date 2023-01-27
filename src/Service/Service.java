package Service;

import Model.EquasionModel;

import java.util.List;

public class Service {
    public EquasionModel sum(EquasionModel a, EquasionModel b){
        int result = a.getNumber() + b.getNumber();

        return new EquasionModel(result);
    }
}
