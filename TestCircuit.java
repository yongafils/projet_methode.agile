package circuitAutomobile;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCircuit extends TestCase {
	
	public TestCircuit(String s) {
		super(s);
	}
	
	@Test
	public void testNewCircuit() {
		Circuit Singapour = new Circuit("Singapour",5000,100000);
		Singapour.setCapacite(90000);
		assertEquals(Singapour.getCapacite(),90000);
	}
	
	@Test
	public void testNewStand() {
		Stand Ferrari = new Stand("Ferrari",5,6);
		Ferrari.setNbTechniciens(7);
		assertEquals(Ferrari.getNbTechniciens(),7);
	}
	
	@Test
	public void testListeStandsCircuit() {
		/** +1 stand => add stand to arrayList listeStands*/
		Stand Ferrari = new Stand("Ferrari",5,6);
		Circuit Singapour = new Circuit("Singapour",5000,100000);
		Singapour.addStand(Ferrari);
		assertEquals(Singapour.getListeStands().size(),1);
		assertEquals(Singapour.getListeStands().get(0),Ferrari);
		/** -1 stand => remove stand from arrayList listeStands*/
		Singapour.removeStand(Ferrari);
		assertEquals(Singapour.getListeStands().size(),0);
	}
	
	
	@Test
	public void testSetCircuitUpdateListeStands() {
		/** setCircuit(circuit) method called on a Stand object 
		 * => updates arrayList listeStands of circuit*/
		Stand Ferrari = new Stand("Ferrari",6,5);
		Circuit Monaco = new Circuit("Monaco",3000,40000);
		Ferrari.setCircuit(Monaco);
		assertEquals(Monaco.getListeStands().size(),1);
		assertEquals(Monaco.getListeStands().get(0),Ferrari);
	}
	
	/** setCircuit() method called on a Stand object 
	 * => updates arrayList listeStands of circuit
	 * + if the stand was already associated to another Circuit object, removes it from its arrayList ListeStands */
	
	@Test
	public void testBidirectionalUpdateListeStands() {
		Stand McLaren = new Stand("McLaren",7,6);
		Circuit Tokyo = new Circuit("Tokyo",2500,60000);
		Circuit Mugello = new Circuit("Mugello",2500,50000);
		mclarenSetCircuit(McLaren, Tokyo, Mugello);
		assertEquals(Tokyo.getListeStands().size(),0);
		assertEquals(Mugello.getListeStands().get(0),McLaren);
	}

	public void mclarenSetCircuit(Stand McLaren, Circuit Tokyo, Circuit Mugello) {
		McLaren.setCircuit(Tokyo);
		McLaren.setCircuit(Mugello);
	}
	
}
