import cacheService.CacheProxy;
import serviceTest.DataService;
import serviceTest.DataServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DataService dataService = CacheProxy.createProxy(new DataServiceImpl());

        System.out.println(dataService.calculateSum(3, 4));
        System.out.println(dataService.calculateSum(3, 4));
        System.out.println(dataService.factorial(4));
        System.out.println(dataService.factorial(4));

    }

}