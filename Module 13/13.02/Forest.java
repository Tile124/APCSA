
/**
 * Write a description of class Forest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Forest extends Terrain
{
    int amountOfTrees;
    int length;
    int width;
    public Forest (int l, int w, int treeCount)
    {
        super(l,w);
        length = l;
        width = w;
        amountOfTrees = treeCount;
    }
    
    public String getTreeCount() {
    return amountOfTrees;
    }
   
}