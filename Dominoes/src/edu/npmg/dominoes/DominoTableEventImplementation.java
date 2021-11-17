package edu.npmg.dominoes;

public class DominoTableEventImplementation implements DominoTableEvent {

	private DominoTable table;
	
	public DominoTableEventImplementation(DominoTable table) {
		this.table = table;
	}
	
	@Override
	public void onDominoTileAdded() {
		if(table != null)
			table.printTable();
	}

}
