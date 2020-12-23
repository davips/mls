mls
===

[This code was useful during my phd, please contact me if you need to put it to work in new versions of sbt and scala]

Wrappers for Weka for Scala (at least at the moment).
If you use this software in your research paper,
please cite properly using the bibtex at the end or the alternatives provided by this DOI link:
[![DOI](https://zenodo.org/badge/doi/10.5281/zenodo.13735.svg)](http://dx.doi.org/10.5281/zenodo.13735)

Installation
------------

* Install [sbt](http://www.scala-sbt.org/release/tutorial/Installing-sbt-on-Linux.html "installing sbt")

* Clone repo:
```
    git clone https://github.com/machine-learning-scala/mls.git
```

* Run included example:
```
    cd mls
    sbt run
```


Use as a library
----------------

* Add a file 'Build.scala' to the 'project' folder of your own project with the contents:
```
    import sbt._

    object MyBuild extends Build {

      lazy val root = Project("root", file(".")) dependsOn(mlsProj)
      lazy val mlsProj = RootProject(uri("https://github.com/machine-learning-scala/mls.git"))

    }
```

* Be happy.

Reference
---------
```
@article{doi/ml,
      author        = "Davi P. Santos and Andr{\'e} Carlos Ponce Leon Ferreira Carvalho",
      journal = "GitHub Software Repository",
      title         = "Wrappers for Weka for Scala",
      month         = "Jan",
      year          = "2015",
      doi           = "{10.5281/zenodo.13735}",
      url           = "{http://dx.doi.org/10.5281/zenodo.13735}",
}
```
