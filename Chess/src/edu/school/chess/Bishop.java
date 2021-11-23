package edu.school.chess;

import edu.school.enums.FigureColor;

public class Bishop extends Figure{
    public Bishop(int row, int col, FigureColor color)
    {
        super(row, col, color);
    }
    @Override
    public void move(Figure[] figures, int destinationRow, int destinationColumn) {
        // TODO Auto-generated method stub
        
        if(!isSelected())
        {
            return;
        }
        if(destinationRow > 8 || destinationRow < 1 || destinationColumn > 8 || destinationColumn < 1)
        {
            return;
        }
    
        int deltaY = Math.abs(getRow() - destinationRow);
        int deltaX = Math.abs(getColumn() - destinationColumn);
        
        if(deltaX == deltaY)
        {           
            if(checkForSameColorOnDestination(figures, destinationRow, destinationColumn))
            {
                setColumn(destinationColumn);
            }
        }
        else return;
        
        
        
    }
    
    
}
