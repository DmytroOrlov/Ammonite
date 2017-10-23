#!/usr/bin/env amm
import ammonite.ops._
import ammonite.ops.ImplicitWd._

%sbt('publishLocal, 'clean, "amm/assembly")
cp.over(pwd/'amm/'target/"scala-2.12"/"ammonite-version-SNAPSHOT-2.12.4", home/'bin/'amm)
%chmod("+x", (home/'bin/'amm).toString)
rm! home/".ammonite"/'cache
