<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<body>

<h3> Dear ${candidate.name}, thanks for filling out the form. Our staff will contact you. </h3>
<br><br>

Your name: ${candidate.name}
<br><br>
Your surname: ${candidate.surname}
<br><br>
Your age: ${candidate.age}
<br><br>
Phone number: ${candidate.phoneNumber}
<br><br>
Email: ${candidate.email}
<br><br>
Your desired position: ${candidate.desiredPosition}
<br><br>
Your work experience: ${candidate.workExperience}
<br><br>
Relocation: ${candidate.relocation}
<br><br>
Your education: ${candidate.education}
<br><br>
Foreign Language(s):
<ul>
    <c:forEach var="lang" items="${candidate.languages}">
        <li>
                ${lang}
        </li>
    </c:forEach>
</ul>

Key Skill(s):
<ul>
    <c:forEach var="skill" items="${candidate.keySkills}">
        <li>
                ${skill}
        </li>
    </c:forEach>
</ul>


</body>

</html>