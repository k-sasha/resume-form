<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2> Dear Candidate, please enter your details </h2>
<br><br>


<form:form action="showDetails" modelAttribute="candidate">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Age <form:input path="age"/>
    <form:errors path="age"/>
    <br><br>
    Phone Number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    Desired Position <form:select path="desiredPosition">
    <form:option value="front-end developer" label="front-end dev."/>
    <form:option value="back-end developer" label="back-end dev."/>
    <form:option value="full stack developer" label="full stack dev."/>
</form:select>
    <br><br>
    Work Experience <form:select path="workExperience">
    <form:options items="${candidate.workExperiences}"/>
</form:select>
    <br><br>

    Relocation: <br>
    Not possible <form:radiobutton path="relocation" value="not possible"/> <br>
    Possible <form:radiobutton path="relocation" value="possible"/> <br>
    Desirable <form:radiobutton path="relocation" value="desirable"/> <br>
    <br><br>

    Education
    <form:radiobuttons path="education" items="${candidate.educations}"/>
    <br><br>

    Foreign Language(s)
    EN <form:checkbox path="languages" value="English"/>
    DE <form:checkbox path="languages" value="German"/>
    FR <form:checkbox path="languages" value="French"/>
    <br><br>

    Key Skill(s)
    <form:checkboxes path="keySkills" items="${candidate.keySkillsMap}"/>

    <br><br>
    <input type="submit" value="OK"/>

</form:form>

</body>

</html>