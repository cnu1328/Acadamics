import dept.Cse;
import dept.Ece;
import dept.Me;
import dept.Ce;

public class DepartmtLst {
    public static void main(String[] args) {
    	Cse c = new Cse();
    	c.display_subjects();
    	
    	System.out.println();
    	
    	Ece e = new Ece();
    	e.display_subjects();
    	
    	System.out.println();
    	
    	Me m = new Me();
    	m.display_subjects();

	System.out.println();
    	
    	Ce ce = new Ce();
    	ce.display_subjects();
    	
    }
}
