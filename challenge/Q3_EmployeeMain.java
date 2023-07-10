package challenge;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q3_EmployeeMain {

	public static void main(String[] args) {
		// 1. 사번과 이름이 같으면 동일한 사람이다. -> HashSet
		Set<Employee> hs = new HashSet<>();
		hs.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
        hs.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
        hs.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
        hs.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
        hs.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
        hs.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
        hs.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
        hs.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
        hs.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
        hs.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));
        
        // 다음 결과는?
        hs.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));
        hs.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));
        
        for (Employee emp: hs)
        	System.out.println(emp);
        System.out.println();
        
        // 2. 출력을 할 경우에는 직급, 입사일자 순으로 출력이 되어야 한다.
        Set<Employee> ts = new TreeSet<>();
        ts.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
        ts.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
        ts.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
        ts.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
        ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
        ts.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
        ts.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
        ts.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
        ts.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
        ts.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));
        
        // 다음 결과는?
        ts.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));
        ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));

        for (Employee emp: ts)
        	System.out.println(emp);
        System.out.println();
	}

}
