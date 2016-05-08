/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gerrit.plugin.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.gerrit.plugin.design.GitReviewForm;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Git",
        id = "org.gerrit.plugin.GitReview"
)
@ActionRegistration(
        iconBase = "icon/git-review.png",
        displayName = "#CTL_GitReview"
)
@ActionReferences({
    @ActionReference(path = "Menu/Versioning", position = 0),
    @ActionReference(path = "Toolbars/Build", position = -20),
    @ActionReference(path = "Shortcuts", name = "DO-R"),
    @ActionReference(path = "Shortcuts", name = "D-R"),
    @ActionReference(path = "Shortcuts", name = "D-C")
})
@Messages("CTL_GitReview=Gerrit Git review...")
public final class GitReview implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        GitReviewForm form = new GitReviewForm();
        form.setVisible(true);
    }
}
