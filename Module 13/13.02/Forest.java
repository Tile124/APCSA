
/**
 * Defines a forest
 *
 * @author Ryan Rodriguez
 * @version 2/9/2019
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
    return ("Forest land has dimensions " + length + " X " + width + " and has "+ amountOfTrees + " trees");
    }
   
}