import unittest 
from Fib-Pyth import check
 class check(unittest.TestCase):
      
      def testcase1(self):
           
           self.assertEqual(0,fib_recursion(1))
           
      def testcase2(self):
           
           self.assertEqual(1,fib_recursion(2))
           
     def testcase3(self):
           
           self.assertEqual(1,fib_recursion(3))
     def testcase4(self):
           
           self.assertEqual(2,fib_recursion(4))
           
           
     def testcase5(self):
           
           self.assertEqual(3,fib_recursion(5))
           
           