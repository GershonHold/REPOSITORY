package com.ffwb;

import java.util.List;
import java.util.ArrayList;

import org.uma.jmetal.problem.impl.AbstractDoubleProblem;
import org.uma.jmetal.solution.DoubleSolution;

public class VRPProblem extends AbstractDoubleProblem{
	
	VRPProblem problem;
	int k;//�������������ʹ�õĳ�����
	double[][] vehicleInfoMatrix;// K�±��1��ʼ��K��0�б�ʾ���������������1�б�ʾ����ʻ�������룬2�б�ʾ�ٶ�
	
	public VRPProblem() {
		this(30);
	}

	//�ù��캯���������þ��߱������� �Ż�Ŀ�꺯������ Լ���������� ��������������
	public VRPProblem(Integer numberOfVariables) {
		setNumberOfVariables(numberOfVariables);
		setNumberOfObjectives(2);
		setNumberOfConstraints(5);
		setName("Problem");
	
	
	List<Double> lowerLimit= new ArrayList<>(getNumberOfVariables()) ;
    List<Double> upperLimit = new ArrayList<>(getNumberOfVariables()) ;
    
    //��һ�������þ��߱����Ķ�����Ϊ{1,0}
    for (int i = 0; i < problem.getNumberOfVariables(); i++) {
		lowerLimit.add(0.0);
		upperLimit.add(1.0);
      }
    	setLowerLimit(lowerLimit);
    	setUpperLimit(upperLimit);
	}

	//�ú����������Ż�Ŀ�꺯����ʵ�ֹ��̣���Algorithm.evlataionPopulation()����
	@Override
	public void evaluate(DoubleSolution solution) {
		double[] f = new double[getNumberOfObjectives()];
		
		f[0] = solution.getVariableValue(0);
		
		
	}

}
