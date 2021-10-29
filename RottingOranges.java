public class RottingOranges{

}
const prettier = require("prettier");
const code = "(add 1 2)";
prettier.format(code, {
  parser: "lisp",
  plugins: ["."],
});