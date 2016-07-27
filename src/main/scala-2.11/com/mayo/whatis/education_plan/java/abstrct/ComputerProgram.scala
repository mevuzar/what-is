package com.mayo.whatis.education_plan.java.abstrct

import com.mayo.whatis.mean.Thing

/**
 * @author yoav @since 7/24/16.
 */
trait ComputerProgram extends Thing{
  val instructions: List[ComputerInstruction]
  val runtime: RuntimeEnvironment
}
