import java.util.ArrayList;

public class TissueCell extends Cell{

    public TissueCell(int x, int y){
        super(0,x,y,1);
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors) {
        // Leave blank for now
    }
}
