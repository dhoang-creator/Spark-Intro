import org.apache.spark.sql.SparkSession

object Main {

  // We have to create an instance of a SparkSession as per below
  val spark = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    .config("spark.some.config.option", "some-value")
    .getOrCreate()

}
