import java.util.Scanner;

// Colby Nicoletti
// A program that outputs the requirements for the Integration Project,
// making it easier to grade.

//Javadoc in SetterAndGetter.java

/**
 * Represents the flow of my program.
 * @author Colby Nicoletti
 *
 */
public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean badInput = true;
 
    Introduction.main();
    
    DataTypes.main(in, badInput);
     
    Boolean.main(in, badInput);
    
    Integer.main(in, badInput);
	
    DoubleMethod.main(in, badInput);
     
    StringMethod.main(in, badInput);
     
    VarAndScope.main(in, badInput);
	 
    FinalMethod.main(in, badInput);
    
    StringUses.main(in, badInput);
     
    EscapeSequences.main(in, badInput);
	 
    CastingExample.main(in, badInput);
	 
    MethodExample.main(in, badInput);
     
    RandomExample.main(in, badInput);
     
    IfStatementExample.main(in, badInput);
     
    TernaryConstructExample.main(in, badInput);
     
    SwitchExample.main(in, badInput);
	
    CompareExample.main(in, badInput);
	 
    Calculator.main(in, badInput);
    
    DoublePlusAndDoubleMinus.main(in, badInput);
     
    RelationalOperatorsExample.main(in, badInput);
     
    PlusEqualsExample.main(in, badInput);
     
    ConditionalOperatorExample.main(in, badInput);
     
    OperatorPrecedenceExample.main(in, badInput);
	 
    WhileExample.main(in, badInput);
     
    ForExample.main(in, badInput);
     
    DoWhileLoopExample.main(in, badInput);
     
    BreakAndContinue.main(in, badInput);
    
    SetterAndGetter.main(in, badInput);
      
    OverloadingMethods.main(in, badInput);
     
    InheritanceDefinition.main(in, badInput);
     
    PolymorphismExample.main(in, badInput);
 	 
    SuperAndThis.main(in, badInput);
     
    ArrayExamples.main(in, badInput);
     
    EnhancedForLoop.main(in, badInput);
     
    TwoDimensionalArray.main(in, badInput);
    
    ArrayListExample.main(in, badInput);
    
    SearchTwoDimensionalArray.main(in, badInput);
    
    in.close();
  }
}
