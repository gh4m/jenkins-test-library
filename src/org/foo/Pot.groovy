package org.foo;

def createNewFile(filename1) {
  echo "this is the  file  ${filename1} that"
  println "date".execute().text
  "date".execute().text > ${filename1}
}
