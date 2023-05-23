import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

 /**J.Unit File testing EllipsoidList2.class.
  * project 8b
  * Heeyoon Son LLB 3
  */
public class EllipsoidList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** Tests getName method in EllipsoidList2 class. **/ 
   @Test public void getNameTest()
   {
      Ellipsoid[] ellipsoidArray = new Ellipsoid[10];
      ellipsoidArray [0] = new Ellipsoid("e1", 1, 2, 3); 
      EllipsoidList2 testList = new EllipsoidList2("testList",
          ellipsoidArray, 1);
      Assert.assertEquals("testList", testList.getName());
   }

/** Tests numberOfEllipsoids method in EllipsoidList2 class. **/    
   @Test public void numberOfEllipsoidsTest()
   {
      Ellipsoid[] ellipsoidArray = new Ellipsoid[10];
      
      ellipsoidArray [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList = new EllipsoidList2("testList",
          ellipsoidArray, 2);
      
      Assert.assertEquals(2, testList.numberOfEllipsoids());
   }

/** Tests totalVolume method in EllipsoidList2 class. **/    
   @Test public void totalVolumeTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 2);
      EllipsoidList2 testList2 = new EllipsoidList2("testList2",
          ellipsoidArray2, 0);
      
      Assert.assertEquals(0, testList2.totalVolume(), 0.000001);
      Assert.assertEquals(527.7875658, testList1.totalVolume(), 0.000001);
   }

/** Tests totalSurfaceArea method in EllipsoidList2 class. **/    
   @Test public void totalSurfaceAreaTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 2);
      EllipsoidList2 testList2 = new EllipsoidList2("testList2",
          ellipsoidArray2, 0);
      
      Assert.assertEquals(0, testList2.totalSurfaceArea(), 0.000001);
      Assert.assertEquals(361.4731391, testList1.totalSurfaceArea(), 0.000001);
   
   }

/** Tests averageVolume method in EllipsoidList2 class. **/    
   @Test public void averageVolumeTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 2);
      EllipsoidList2 testList2 = new EllipsoidList2("testList2",
          ellipsoidArray2, 0);
      
      Assert.assertEquals(0, testList2.averageVolume(), 0.000001);
      Assert.assertEquals(263.8937829, testList1.averageVolume(), 0.000001);
   
   }

/** Tests averageSurfaceArea method in EllipsoidList2 class. **/   
   @Test public void averageSurfaceAreaTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 2);
      EllipsoidList2 testList2 = new EllipsoidList2("testList2",
          ellipsoidArray2, 0);
      
      Assert.assertEquals(0, testList2.averageSurfaceArea(), 0.000001);
      Assert.assertEquals(180.7365696, testList1.averageSurfaceArea(),
          0.000001);
   
   }

/** Tests toString method in EllipsoidList2 class. **/   
   @Test public void toStringTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 2);
      EllipsoidList2 emptyList = new EllipsoidList2("emptyList",
          null, 0);
      
      Assert.assertEquals(null, emptyList.toString());
      Assert.assertEquals("testList1\n"
               + "\nEllipsoid \"e1\" with axes a = "
               + "1.0, b = 2.0, c = 3.0 units has:"
               + "\n\tvolume = 25.1327 cubic units"
               + "\n\tsurface area = 48.9366 square units\n"
               + "\nEllipsoid \"e2\" with axes a = 4.0, b = "
               + "5.0, c = 6.0 units has:"
               + "\n\tvolume = 502.6548 cubic units"
               + "\n\tsurface area = 312.5365 square units\n",
                   testList1.toString());
   }

/** Tests summaryInfo method in EllipsoidList2 class. **/    
   @Test public void summaryInfoTest()
   {
      Ellipsoid[] ellipsoidArray = new Ellipsoid[10];
      
      ellipsoidArray [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList = new EllipsoidList2("testList",
          ellipsoidArray, 2);
      
      Assert.assertEquals("----- Summary for testList -----"
               + "\nNumber of Ellipsoid Objects: 2"
               + "\nTotal Volume: 527.788 cubic units"
               + "\nTotal Surface Area: 361.473 square units"
               + "\nAverage Volume: 263.894 cubic units"
               + "\nAverage Surface Area: 180.737 square units",
                   testList.summaryInfo());
   }

/** Tests readFile method in EllipsoidList2 class.**/ 
/** @throws IOException its for file. **/  
   @Test public void readFileTest() throws IOException
   {
      EllipsoidList2 testList = new EllipsoidList2("", null, 5);
      testList = testList.readFile("Ellipsoid_data_1.txt");
      Assert.assertEquals("----- Summary for Ellipsoid Test List -----"
               + "\nNumber of Ellipsoid Objects: 3"
               + "\nTotal Volume: 41,891,380.796 cubic units"
               + "\nTotal Surface Area: 674,531.564 square units"
               + "\nAverage Volume: 13,963,793.599 cubic units"
               + "\nAverage Surface Area: 224,843.855 square units",
                   testList.summaryInfo());
   }

/** Tests getList method in EllipsoidList2 class. **/   
   @Test public void getListTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      
      ellipsoidArray2 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray2 [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList = new EllipsoidList2("testList",
          ellipsoidArray1, 2);
      
      Assert.assertArrayEquals(ellipsoidArray2, testList.getList());
   }
   
/** Tests addEllipsoid method in EllipsoidList2 class. **/   
   @Test public void addEllipsoidTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      ellipsoidArray2 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray2 [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList = new EllipsoidList2("testList",
          ellipsoidArray1, 1);
      testList.addEllipsoid("e2", 4, 5, 6);
      
      Assert.assertArrayEquals(ellipsoidArray2, testList.getList());
      
   }

/** Tests findEllipsoid method in EllipsoidList2 class. **/    
   @Test public void findEllipsoidTest()
   {
      Ellipsoid[] ellipsoidArray = new Ellipsoid[10];
      ellipsoidArray [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray [1] = new Ellipsoid("e2", 4, 5, 6);
      
      EllipsoidList2 testList = new EllipsoidList2("testList",
          ellipsoidArray, 2);
      
      Assert.assertEquals(ellipsoidArray [0], testList.findEllipsoid("e1"));
      Assert.assertEquals(null, testList.findEllipsoid("e5"));
   }

/** Tests deleteEllipsoid method in EllipsoidList2 class. **/  
   @Test public void deleteEllipsoidTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray1 [2] = new Ellipsoid("e3", 7, 8, 9);
      
      ellipsoidArray2 [2] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray2 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray2 [0] = new Ellipsoid("e3", 7, 8, 9);
      
      Ellipsoid deletedEllipsoid2 = new Ellipsoid("e2", 4, 5, 6);
      Ellipsoid deletedEllipsoid1 = new Ellipsoid("e1", 1, 2, 3);
      Ellipsoid deletedEllipsoid3 = new Ellipsoid("e3", 7, 8, 9);
       
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 3);
      EllipsoidList2 testList2 = new EllipsoidList2("testList2",
          ellipsoidArray2, 3);
          
      Assert.assertEquals(deletedEllipsoid2, testList1.deleteEllipsoid("e2"));
      Assert.assertEquals(deletedEllipsoid1, testList1.deleteEllipsoid("e1"));
      Assert.assertEquals(deletedEllipsoid2, testList2.deleteEllipsoid("e2"));
      Assert.assertEquals(deletedEllipsoid1, testList2.deleteEllipsoid("e1"));
      Assert.assertEquals(null, testList1.deleteEllipsoid("e9"));
   
   }

/** Tests editEllipsoid method in EllipsoidList2 class. **/   
   @Test public void editEllipsoidTest()
   {
      Ellipsoid[] ellipsoidArray = new Ellipsoid[10];
      ellipsoidArray [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray [1] = new Ellipsoid("e2", 4, 5, 6);
      
      Ellipsoid editedEllipsoid = new Ellipsoid("e2", 7, 7, 7);
      EllipsoidList2 testList = new EllipsoidList2("testList",
          ellipsoidArray, 2);
      
      Assert.assertEquals(editedEllipsoid,
          testList.editEllipsoid("e2", 7, 7, 7));
      Assert.assertEquals(null, testList.editEllipsoid("e9", 6, 7, 7));
   }

/** Tests findEllipsoidWithSmallestVolume method. **/    
   @Test public void findEllipsoidWithSmallestVolumeTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray3 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray1 [2] = new Ellipsoid("e3", 7, 8, 9);
      
      ellipsoidArray3 [2] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray3 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray3 [0] = new Ellipsoid("e3", 7, 8, 9);
      
      Ellipsoid ellipsoidWithSmallestV = new Ellipsoid("e1", 1, 2, 3);
      
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 3);
      EllipsoidList2 testList2 = new EllipsoidList2("testList2",
          ellipsoidArray2, 0);
      EllipsoidList2 testList3 = new EllipsoidList2("testList3",
          ellipsoidArray3, 3);
      
      Assert.assertEquals(ellipsoidWithSmallestV,
          testList1.findEllipsoidWithSmallestVolume());
      Assert.assertEquals(ellipsoidWithSmallestV,
          testList3.findEllipsoidWithSmallestVolume());
      Assert.assertEquals(null, testList2.findEllipsoidWithSmallestVolume());
   }

/** Tests findEllipsoidWithLargestVolume method. **/     
   @Test public void findEllipsoidWithLargestVolumeTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray3 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray1 [2] = new Ellipsoid("e3", 7, 8, 9);
      
      ellipsoidArray3 [2] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray3 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray3 [0] = new Ellipsoid("e3", 7, 8, 9);
      
      Ellipsoid ellipsoidWithLargestV = new Ellipsoid("e3", 7, 8, 9);
      
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 3);
      EllipsoidList2 testList2 = new EllipsoidList2("testList2",
          ellipsoidArray2, 0);
      EllipsoidList2 testList3 = new EllipsoidList2("testList3",
          ellipsoidArray3, 3);
          
      Assert.assertEquals(ellipsoidWithLargestV,
          testList1.findEllipsoidWithLargestVolume());
      Assert.assertEquals(ellipsoidWithLargestV,
          testList3.findEllipsoidWithLargestVolume());
      Assert.assertEquals(null,
          testList2.findEllipsoidWithLargestVolume());
   }

/** Tests findEllipsoidWithSmallestSurfaceArea method. **/     
   @Test public void findEllipsoidWithSmallestSurfaceAreaTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray3 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray1 [2] = new Ellipsoid("e3", 7, 8, 9);
      
      ellipsoidArray3 [2] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray3 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray3 [0] = new Ellipsoid("e3", 7, 8, 9);
      
      Ellipsoid ellipsoidWithSmallestSA = new Ellipsoid("e1", 1, 2, 3);
      
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 3);
      EllipsoidList2 testList2 = new EllipsoidList2("testList2",
          ellipsoidArray2, 0);
      EllipsoidList2 testList3 = new EllipsoidList2("testList3",
          ellipsoidArray3, 3);
          
      Assert.assertEquals(ellipsoidWithSmallestSA,
          testList1.findEllipsoidWithSmallestSurfaceArea());
      Assert.assertEquals(ellipsoidWithSmallestSA,
          testList3.findEllipsoidWithSmallestSurfaceArea());
      Assert.assertEquals(null,
          testList2.findEllipsoidWithSmallestSurfaceArea());
   }

/** Tests findEllipsoidWithLargestSurfaceArea method. **/     
   @Test public void findEllipsoidWithLargestSurfaceAreaTest()
   {
      Ellipsoid[] ellipsoidArray1 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray2 = new Ellipsoid[10];
      Ellipsoid[] ellipsoidArray3 = new Ellipsoid[10];
      
      ellipsoidArray1 [0] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray1 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray1 [2] = new Ellipsoid("e3", 7, 8, 9);
      
      ellipsoidArray3 [2] = new Ellipsoid("e1", 1, 2, 3);
      ellipsoidArray3 [1] = new Ellipsoid("e2", 4, 5, 6);
      ellipsoidArray3 [0] = new Ellipsoid("e3", 7, 8, 9);
      
      Ellipsoid ellipsoidWithLargestSA = new Ellipsoid("e3", 7, 8, 9);
      
      EllipsoidList2 testList1 = new EllipsoidList2("testList1",
          ellipsoidArray1, 3);
      EllipsoidList2 testList2 = new EllipsoidList2("testList2",
          ellipsoidArray2, 0);
      EllipsoidList2 testList3 = new EllipsoidList2("testList3",
          ellipsoidArray3, 3);
      
      Assert.assertEquals(ellipsoidWithLargestSA,
          testList1.findEllipsoidWithLargestSurfaceArea());
      Assert.assertEquals(ellipsoidWithLargestSA,
          testList3.findEllipsoidWithLargestSurfaceArea());
      Assert.assertEquals(null,
          testList2.findEllipsoidWithLargestSurfaceArea());
   }
}
