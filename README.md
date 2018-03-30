# Java Halstead Metrics Evaluator

This tool computes [Halstead Metrics](https://maisqual.squoring.com/wiki/index.php/Category:Halstead_Metrics) for Java.

## Usage

In you java application ...

``` java
import com.github.mizzlr.halsteadmetrics.Initiator;
import com.github.mizzlr.halsteadmetrics.MetricsEvaluator;

...
Initiator initiator = new Initiator();
MetricsEvaluator me = initiator.initiate(filePath);  // Absolute file path as String

System.out.println("ProgramLength: " + me.PROGRAM_LENGTH);
System.out.println("ProgramEffort: " + me.PROGRAM_EFFORT);
System.out.println("ProgramTime: " + me.PROGRAMMING_TIME);
System.out.println("ProgramVocabulary: " + me.PROGRAM_VOCABULARY);
System.out.println("ProgramDifficulty: " + me.DIFFICULTY);
System.out.println("EstimatedLength: " + me.ESTIMATED_LENGTH);
System.out.println("PurityRatio: " + me.PURITY_RATIO);
System.out.println("ProgramVolume: " + me.VOLUME);
System.out.println("IntelligentContent: " + me.INTELLIGENT_CONTENT);
System.out.println("HalsteadBigN1: " + me.N1);
System.out.println("HalsteadBigN2: " + me.N2);
System.out.println("HalsteadSmallN1: " + me.n1);
System.out.println("HalsteadSmallN2: " + me.n2);

...
```
