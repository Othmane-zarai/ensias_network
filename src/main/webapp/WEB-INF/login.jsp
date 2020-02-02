<!DOCTYPE html>
<html lang="en">
  <head>
    <title>JEE</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="images/logo1.ico" />
    <link rel="stylesheet" type="text/css" href="css/util.css" />
    <link rel="stylesheet" type="text/css" href="css/main.css" />
    <!--===============================================================================================-->
  </head>
  <body>
    <div
      class="log_contain"
      style="background-image: url('images/00_plat.jpg');"
    >
      <div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
        <form
          class="login100-form validate-form"
          action="${contextPath}/login"
          method="post"
        >
          <span class="login100-form-title p-b-37">
            Sign In
          </span>
          <!--                   the m-b-XX is for text Format do not DELETE    -->
          <div class="form-group ${error != null ? 'has-error' : ''}">
          <span>${message}</span>
          <div class="log_inputs m-b-20" data-validate="Enter email">
            <input
              class="input100"
              type="text"
              name="username"
              placeholder="Username"
            />
            <span class="focus-input100"></span>
          </div>

          <div class="log_inputs m-b-25" data-validate="Enter password">
          <span>${error}</span>
            <input
              class="input100"
              type="password"
              name="mot_passe"
              placeholder="Mot_passe"
            />
            <span class="focus-input100"></span>
          </div>

          <div class="log_contain-form-btn">
            <button class="login100-form-btn" type="submit">
              Sign In
            </button>
          </div>
          <div class="text-center">
            <p>
              <a href="Forgotpass.html" class="txt2 hov1">
                Forgot password ?
              </a>
            </p>
          </div>
          </div>
          <div class="text-center"></div>
        </form>
      </div>
    </div>
  </body>
</html>
