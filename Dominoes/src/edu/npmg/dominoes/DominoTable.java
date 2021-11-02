package edu.npmg.dominoes;

public class DominoTable {
	
	private final int NUMBER_OF_TILES = 28;
	private DominoTile[] tiles;
	private int firstFreeIndex;
	
	public DominoTable()
	{
		tiles = new DominoTile[NUMBER_OF_TILES];
		firstFreeIndex = 0;
	}
	
	private boolean isTableEmpty()
	{
		return firstFreeIndex == 0;
	}
	
	public boolean addLeft(DominoTile tile)
	{
		if(isTableEmpty())
		{
			return addRight(tile);
		}
		else
		{
			DominoTile leftest = tiles[0];
			if(leftest.getLeft() == tile.getRight())
			{
				for(int i = firstFreeIndex-1; i >= 0; i--)
				{
					tiles[i+1] = tiles[i];
				}
				tiles[0] = tile;
				firstFreeIndex++;
				return true;
			}
			else
			{
				tile.reverse();
				if(leftest.getLeft() == tile.getRight())
				{
					for(int i = firstFreeIndex-1; i >= 0; i--)
					{
						tiles[i+1] = tiles[i];
					}
					tiles[0] = tile;
					firstFreeIndex++;
					return true;
				}
				return false;
			}
		}
	}
	
	
	public boolean addRight(DominoTile tile)
	{
		if(isTableEmpty()) //if table is empty
		{
			tiles[firstFreeIndex] = tile;
			firstFreeIndex++;
			return true;
		}
		else
		{
			DominoTile rightest = tiles[firstFreeIndex-1];
			if(rightest.getRight() == tile.getLeft())
			{
				tiles[firstFreeIndex] = tile;
				firstFreeIndex++;
				return true;
			}
			else
			{
				tile.reverse();
				if(rightest.getRight() == tile.getLeft())
				{
					tiles[firstFreeIndex] = tile;
					firstFreeIndex++;
					return true;
				}
			}
			return false;
		}
	}
	
	public void printTable()
	{
		/*
		for(int i = 0; i<firstFreeIndex; i++)
		{
			System.out.println(tiles[i]);
		}
		*/
		for(DominoTile tile : tiles)
		{
			if(tile != null)
			{
				System.out.println(tile);
			}
		}
	}
}
