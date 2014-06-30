/*
mls: basic machine learning algorithms for Scala
Copyright (C) 2014 Davi Pereira dos Santos

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package ml.classifiers

import weka.classifiers.Classifier
import ml.Pattern
import weka.classifiers.bayes.NaiveBayes
import ml.models.Model

case class NB() extends BatchWekaLearner {
  override val toString = "NB"

  def expected_change(model: Model)(pattern: Pattern): Double = ???

  def build(patterns: Seq[Pattern]): Model = {
    val classifier = new NaiveBayes
    classifier.setUseSupervisedDiscretization(false) //true=slow?
    generate_model(classifier, patterns)
  }

  protected def test_subclass(classifier: Classifier) = classifier match {
    case cla: NaiveBayes => cla
    case _ => throw new Exception(this + " requires NaiveBayes.")
  }

  override def EMC(model: Model)(patterns: Seq[Pattern]): Pattern = ???
}
