package integrationTests;

import integrationTests.organisation.test.TestOrganisation;
import integrationTests.registry.manager.RestServiceCurdTest;
import integrationTests.tpi.test.RestServicesTest;
import integrationTests.user.auth.test.AllServicesTest;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 * Created by anurag on 14-Feb-18.
 */
public class CommonRunner {

    static String mobileNo;
   static int pass=0,fail=0;


    public static void main(String[] args) {

        RestServiceCurdTest restServiceCurdTest = new RestServiceCurdTest();
        mobileNo = restServiceCurdTest.mobileNumer;


        try {

            if (restServiceCurdTest.startTest()) {
                pass++;
                Logger.getGlobal().info("Registry Manager Test Passed");

            } else {
                fail++;
                System.err.println("Registry Manager Test Failed!!");
            }
            Thread.sleep(3000);

            if (new TestOrganisation(mobileNo).startTest()) {
                pass++;
                Logger.getGlobal().info("Organisation Test Passed");

            } else {
                fail++;
                System.err.println("Organisation Test Failed");
            }

            Thread.sleep(3000);

            RestServicesTest restServicesTest = new RestServicesTest();
            restServicesTest.startTest();
            Thread.sleep(5000);

            if (restServicesTest.isAllTestPass) {
                pass++;
                Logger.getGlobal().info("Tpi Manager Test Passed");

            } else {
                fail++;
                System.err.println("Tpi Manager Test Failed!!");
            }

            Thread.sleep(3000);

            if (new AllServicesTest().allServicesTest()) {
                pass++;
                Logger.getGlobal().info("User Auth Manager Test Passed");
            } else {
                fail++;
                System.err.println("User Auth Manager Test Failed!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            fail = -1;
            Logger.getGlobal().warning(" Test Case is fail!!");
        }
        if (fail != -1) {

            if (fail == 0) {
                Logger.getGlobal().warning("All Test Cases is Done :)");
            } else {
                Logger.getGlobal().warning(fail + " Test Cases is not passed :(");
            }

        }
    }

    }
