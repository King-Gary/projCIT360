/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Gary
 */
public class Model {
    private int multiplyValue;

	

	public void multiplyTwoNumbers(int firstNumber, int secondNumber){

		

		multiplyValue = firstNumber * secondNumber;

		

	}

	

	public int getMultiplyValue(){

		

		return multiplyValue;

		

	}

	

	// Add

		private int addValue;

		

		public void addTwoNumbers(int firstNumber, int secondNumber){

			

			addValue = firstNumber + secondNumber;

			

		}

		

		public int getAdditionValue(){

			

			return addValue;

			

			

			

		}

		

		// Subtract

				private int subtractValue;

				

				public void subtractTwoNumbers(int firstNumber, int secondNumber){

					

					subtractValue = firstNumber - secondNumber;

					

				}

				

				public int getSubtractionValue(){

					

					return subtractValue;

					

				}
}
