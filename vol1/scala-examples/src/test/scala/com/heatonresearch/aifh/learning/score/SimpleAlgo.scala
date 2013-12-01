/*
 * Artificial Intelligence for Humans
 * Volume 1: Fundamental Algorithms
 * Scala Version
 * http://www.aifh.org
 * http://www.jeffheaton.com
 *
 * Code repository:
 * https://github.com/jeffheaton/aifh

 * Copyright 2013 by Jeff Heaton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For more information on Heaton Research copyrights, licenses
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package com.heatonresearch.aifh.learning.score

import com.heatonresearch.aifh.learning.ClassificationAlgorithm
import com.heatonresearch.aifh.learning.RegressionAlgorithm
import scala.collection.mutable.ArrayBuffer

/**
 * Simple learning algorithm to test.
 */
class SimpleAlgo(cannedResults: Vector[Double]) extends RegressionAlgorithm with ClassificationAlgorithm {

  private var currentIndex: Int = 0

  override def computeClassification(input: Vector[Double]): Int = {
    val res = cannedResults(currentIndex).toInt
    currentIndex +=1
    res
  }

  override def computeRegression(input: Vector[Double]): Vector[Double] = {
    val res = cannedResults(currentIndex)
    currentIndex += 1
    Vector(res)
  }

  override val longTermMemory = ArrayBuffer[Double]()
}