/**
  * Created by donghwankim on 2017. 7. 6..
  */

def f(): Int = try { return 1 } finally { return 2 }

def g(): Int = try { 1 } finally { 2 }
