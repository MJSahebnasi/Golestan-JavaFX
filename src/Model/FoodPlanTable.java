package Model;

import Model.Food;

public class FoodPlanTable {
    private Food[][] table = new Food[7][3];

    public void setTable(Food food, int row , int col) {
        this.table[row][col] = food;
    }
}
