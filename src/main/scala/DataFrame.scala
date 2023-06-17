import Main.spark
import org.apache.spark.sql.SparkSession

// We need to revisit the DF taken from a url or from a
object DataFrame {

  // does the below statement not simply conflict with the df you've attempted to make in Main
  val spark = SparkSession.builder.getOrCreate()

}
