package Classes.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestCaseProjetFormation {

	@Rule
	public ExpectedException exception = ExpectedException.none();
	public ValidationFormateur vf;
	public ValidationFormation vformation;
	public ValidationGenerale vg;
	public ValidationSession vs;

	@Before
	public void setUp() {
		this.vf = new ValidationFormateur();
		this.vformation = new ValidationFormation();
		this.vg = new ValidationGenerale();
		this.vs = new ValidationSession();
	}

	@Test
	public void testID() {
		assertFalse(vg.validationPositif(0));
		assertTrue(vg.validationPositif(10));
		assertFalse(vg.validationPositif(-3));
	}

	@Test
	public void testTitre() {
		assertFalse(vformation.titreIsValid("To"));
		assertTrue(vformation.titreIsValid("Tot"));
		assertTrue(vformation.titreIsValid("Totororo"));
	}

	@Test
	public void testPrix() {
		assertFalse(vformation.prixIsValid(0));
		assertFalse(vformation.prixIsValid(100));
		assertTrue(vformation.prixIsValid(250));
	}

	@Test
	public void testNbHeures() {
		assertFalse(vformation.nbHeuresIsValid(10));
		assertTrue(vformation.nbHeuresIsValid(11));
		assertTrue(vformation.nbHeuresIsValid(40));
	}

	@Test
	public void testNotEmpty() {
		assertTrue(vg.validationChaine("Hello ! "));
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
